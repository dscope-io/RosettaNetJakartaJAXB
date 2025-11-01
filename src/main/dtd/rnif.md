# RNIF 2.0 Envelope Overview

This note summarizes the RosettaNet Implementation Framework (RNIF) 2.0 message envelope artifacts that live under `src/main/dtd/rnif-v-02-00-01`. The source material consists of the Message Guideline (MG) HTML files and the Message Schema (MS) DTDs for the RNIF preamble, delivery header, service header, and the standard signal messages.

All envelope components share the namespace `http://www.rosettanet.org/RNIF/V02.00` as defined in each `*_MS_V02_00.dtd` file.

## Envelope Building Blocks

RNIF messages wrap business payloads with three mandatory headers and two standard signals:

- `Preamble` – identifies the governing standard and version (see `Preamble_MS_V02_00.dtd`).
- `DeliveryHeader` – captures transport-level metadata such as sender, receiver, and tracking identifiers (see `DeliveryHeader_MS_V02_00.dtd`).
- `ServiceHeader` – carries process control, business activity, and quality-of-service information (see `ServiceHeader_MS_V02_00.dtd`).
- `ReceiptAcknowledgment` – optional non-repudiation signal returned by the receiver (see `AcknowledgmentOfReceipt_MS_V02_00.dtd`).
- `Exception` – signal for protocol or validation errors (see `Exception_MS_V02_00.dtd`).

## Preamble

Structure from `Preamble_MS_V02_00.dtd`:

- `standardName.GlobalAdministeringAuthorityCode`
  - Message guideline (`Preamble_MG_V02_00_01.htm`) states that RosettaNet-compliant envelopes **must** use the fixed value `RosettaNet`.
- `standardVersion.VersionIdentifier`
  - Must match the RNIF release. For RNIF 2.0 this value is `V02.00`.

## Delivery Header

Structure from `DeliveryHeader_MS_V02_00.dtd`:

- `isSecureTransportRequired.AffirmationIndicator`
  - Indicates whether partners must employ a secure transport channel for this exchange.
- `messageDateTime.DateTimeStamp`
  - Timestamp of when the message instance was created.
- `messageReceiverIdentification.PartnerIdentification`
  - Contains optional `domain` (free-form text), mandatory `GlobalBusinessIdentifier`, and optional `locationID.Value`.
- `messageSenderIdentification.PartnerIdentification`
  - Mirrors the receiver structure for the sending partner.
- `messageTrackingID.InstanceIdentifier`
  - Unique identifier used for delivery tracking and correlation.

## Service Header

`ServiceHeader_MS_V02_00.dtd` defines the largest portion of the envelope. Key subsections and rules pulled from the DTD and the companion guideline (`ServiceHeader_MG_V02_00_01.htm`):

### ProcessControl

```
ProcessControl → ActivityControl, GlobalUsageCode, partnerDefinedPIPPayloadBindingId?,
                 pipCode, pipInstanceId, pipVersion, QualityOfServiceSpecification?,
                 (KnownInitiatingPartner | UnknownInitiatingPartner)
```

- `ActivityControl`
  - `BusinessActivityIdentifier` – business activity name or code.
  - `MessageControl` – defines routing metadata:
    - `fromRole.GlobalPartnerRoleClassificationCode` – initiating role.
    - `fromService.GlobalBusinessServiceCode` – sending service.
    - `inReplyTo.ActionControl` (optional for initial messages; guideline notes it **must** be present for follow-up actions).
    - `Manifest` – attachment manifest containing zero or more `Attachment` entries, `numberOfAttachments.CountableAmount` (MUST be `0` when no attachments are present, per guideline), and `ServiceContentControl` specifying `ActionIdentity` or `SignalIdentity` for the payload.
    - `toRole` / `toService` – receiving role and service.
- `GlobalUsageCode`
  - Typically `Test` or `Production`; guideline enumerates the two allowed entity instances for this field.
- `partnerDefinedPIPPayloadBindingId.ProprietaryReferenceIdentifier` (optional)
  - Trading partners may supply a private identifier when non-RosettaNet payload content is exchanged; must be absent when the payload is RosettaNet-defined.
- `pipCode.GlobalProcessIndicatorCode`
  - Mandatory Partner Interface Process (PIP) code, e.g. `3A4`.
- `pipInstanceId.InstanceIdentifier`
  - Must be unique within the initiating partner’s context.
- `pipVersion.VersionIdentifier`
  - Must match the `PIP Version Identifier` specified in the relevant PIP specification (see guideline constraint block).
- `QualityOfServiceSpecification` (optional)
  - One or more `QualityOfServiceElement` entries, each combining a `QualityOfServiceClassificationCode` and a related `Value`. Acceptable values are defined per classification in the trading partner agreement.
- `KnownInitiatingPartner.PartnerIdentification`
  - Used when the receiver can resolve the initiator from the standard identifier set.
- `UnknownInitiatingPartner`
  - Adds a `UniformResourceLocator` field; guideline states this **must** be supplied to enable follow-up processing when the initiating partner is not pre-registered.

### Action and Signal Identity

- `ActionIdentity`
  - `GlobalBusinessActionCode` – identifies the business action that generated the payload.
  - Optional `messageStandard.FreeFormText` and `standardVersion.VersionIdentifier` – required only when the action uses a non-RosettaNet-defined service.
  - `messageTrackingID.InstanceIdentifier` – correlates replies (`inReplyTo`) and signals.
- `SignalIdentity`
  - `GlobalBusinessSignalCode` plus `VersionIdentifier` for standard signal payloads included in the manifest.

### Attachments

Each `Attachment` consists of:

- Optional `description.FreeFormText` (language tagged via `xml:lang`).
- `GlobalMimeTypeQualifierCode` – MIME type (must be chosen from the registered MIME list per the guideline).
- `UniversalResourceIdentifier` – reference to the attachment body (guideline requires content-ID syntax when attachments are inline in a MIME envelope).

## Receipt Acknowledgment Signal

Defined in `AcknowledgmentOfReceipt_MS_V02_00.dtd`:

- `ReceiptAcknowledgment`
  - Optional `NonRepudiationInformation`
    - `OriginalMessageDigest` – hash of the received RNIF message used for non-repudiation of receipt.

The signal is generally returned synchronously or asynchronously to confirm successful delivery of the RNIF envelope.

## Exception Signal

Defined in `Exception_MS_V02_00.dtd`:

- `Exception`
  - `ExceptionDescription`
    - `errorClassification.GlobalMessageExceptionCode` – categorizes the failure (e.g., validation, processing, or security issues).
    - `errorDescription.FreeFormText` – human-readable explanation; supports `xml:lang`.
    - Optional `offendingMessageComponent.GlobalMessageComponentCode` – pinpoints the structure that failed validation.
  - `GlobalExceptionTypeCode` – high-level exception group identifier.

The exception signal is emitted when RNIF detects protocol violations, schema errors, or processing failures.

## Additional Assets

The directory also contains the full RNIF 2.0 PDF specification (`RNIF_Spec_V02_00_01.pdf`), release notes, and reference graphics. Consult these artifacts for deeper semantic rules beyond what is captured in the schemas.
