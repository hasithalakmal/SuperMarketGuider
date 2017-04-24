package com.smile24es.ts_project.utill;

/**
 * The class to hold error codes for Permission API
 */
public final class ErrorCode {

    private ErrorCode() {
        //Disallow instantiation
    }

    public static final String UNEXPECTED_ERROR = "10010";
    public static final String INVALID_PARAMETERS = "10000";
    public static final String ERROR_IN_CONNECTING_TO_IDM_USER_SERVICE = "10100";
    public static final String ERROR_IN_CONNECTING_TO_EVENT_HUB = "10200";
    public static final String PROFILE_NOT_FOUND = "10300";
    public static final String ERROR_IN_GENERATING_PROFILE_TOKEN = "10400";
    public static final String ERROR_IN_GENERATING_MESSAGE_BODY = "10500";
    public static final String ERROR_IN_SENDING_EMAIL = "10600";
    public static final String USER_TOKEN_EXPIRED = "10700";
    public static final String IDM_USER_NOT_FOUND = "10800";
    public static final String INVALID_PROFILE_STATUS = "10900";

    public static final String GENERIC_DAO_LEVEL_EXCEPTION = "20000";
    public static final String FORBIDDEN_TYPE_FOR_USER_RETRIEVAL_BY_USER_TYPE = "20100";
    public static final String ERROR_IN_AUTHENTICATING_IDM_USER = "20200";
    public static final String ERROR_IN_CREATING_IDM_GROUP = "20300";
    public static final String ERROR_IN_FETCHING_IDM_GROUP_ID = "20400";
    public static final String ERROR_IN_CREATING_IDM_USER = "20500";
    public static final String ERROR_IN_ASSIGNING_IDM_USER_TO_GROUP = "20600";
    public static final String EMAIL_ALREADY_VERIFIED = "20700";
    public static final String ATTRIBUTE_UPDATE_FORBIDDEN = "20800";
}
