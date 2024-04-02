package org.swasth.hcx.utils;

import java.util.Arrays;
import java.util.List;

public class Constants {

    public static final String VERSION_PREFIX = "/v0.7";

    // Coverage Eligibility APIs
    public static final String COVERAGE_ELIGIBILITY_CHECK = "/coverageeligibility/check";
    public static final String COVERAGE_ELIGIBILITY_ONCHECK =  "/coverageeligibility/on_check";
    public static final String COVERAGE_ELIGIBILITY = "coverageeligibility";
    public static final String CLAIM = "claim";
    public static final String PRE_AUTH = "preauth";
    public static final String REQUEST_LIST = "/request/list";
    public static final String UPLOAD_DOCUMENTS  = "/upload/documents";
    // Claims APIs
    public static final String PRE_AUTH_SUBMIT = "/preauth/submit";
    public static final String PRE_AUTH_ONSUBMIT =  "/preauth/on_submit";
    public static final String CLAIM_SUBMIT = "/claim/submit";
    public static final String CLAIM_ONSUBMIT =  "/claim/on_submit";
    public static final String CONSULTATION_ADD = "/consultation/add";
    public static final String USER_SEARCH = "/user/search/{mobile}";
    public static final String USER_CREATE = "/user/create";
    public static final String PAYLOAD = "payload";
    public static final String SENDER_CODE = "x-hcx-sender_code";
    public static final String RECIPIENT_CODE = "x-hcx-recipient_code";
    public static final String API_CALL_ID = "x-hcx-api_call_id";
    public static final String CORRELATION_ID = "x-hcx-correlation_id";
    public static final String WORKFLOW_ID = "x-hcx-workflow_id";
    public static final String TIMESTAMP = "x-hcx-timestamp";
    public static final String DEBUG_FLAG = "x-hcx-debug_flag";
    public static final String STATUS = "x-hcx-status";
    public static final String ERROR_DETAILS = "x-hcx-error_details";
    public static final String DEBUG_DETAILS = "x-hcx-debug_details";
    public static final String SERVICE_MODE = "service.mode";
    public static final String GATEWAY = "gateway";
    public static final String NOTIFICATION_NOTIFY = "/notification/notify";
    public static final String SUBSCRIPTION_ID = "subscription_id";
    public static final String MOBILE = "mobile";
    public static final  String ABSP = "ABSP";
    public static final String PATIENT_NAME = "patientName";
    public static final String ITEMS = "items";
    public static final String ITEM_NAME = "name";
    public static final String SPECIALITY_TYPE = "specialityType";
    public static final String SERVICE_LOCATION = "serviceLocation";
    public static final String TREATMENT_SUB_CATEGORY = "treatmentSubCategory";
    public static final String TREATMENT_CATEGORY = "treatmentCategory";
    public static final String PENDING = "Pending";
    public static final String SUCCESSFUL = "successful";
    public static final String FAILED = "failed";

    public static final String ENC = "enc";

}
