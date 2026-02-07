package com.prx.commons.util;


import com.prx.commons.constants.httpstatus.key.*;
import com.prx.commons.constants.httpstatus.type.MessageType;

/**
 * HttpStatus.
 * <p>
 * Utility class for HTTP status codes and their corresponding messages.
 * Provides constants for common HTTP status codes and a method to retrieve message types based on status code.
 * </p>
 *
 * @author Luis Antonio Mata
 */
public final class HttpStatusUtil {
    public static final int CONTINUE = 100;
    public static final String CONTINUE_STR = "100";
    public static final int SWITCHING_PROTOCOLS =101;
    public static final String SWITCHING_PROTOCOLS_STR = "101";
    public static final int PROCESSING = 102;
    public static final String PROCESSING_STR = "102";

    public static final int OK = 200;
    public static final String OK_STR = "200";
    public static final int CREATED = 201;
    public static final String CREATED_STR = "201";
    public static final int ACCEPTED = 202;
    public static final String ACCEPTED_STR = "202";
    public static final int NO_CONTENT = 204;
    public static final String NO_CONTENT_STR = "204";

    public static final int MULTIPLE_CHOICES  = 300;
    public static final String MULTIPLE_CHOICES_STR = "300";
    public static final int MOVED_PERMANENTLY  = 301;
    public static final String MOVED_PERMANENTLY_STR = "301";
    public static final int FOUND  = 302;
    public static final String FOUND_STR = "302";
    public static final int SEE_OTHER         = 303;
    public static final String SEE_OTHER_STR = "303";
    public static final int NOT_MODIFIED = 304;
    public static final String NOT_MODIFIED_STR = "304";

    public static final int BAD_REQUEST = 400;
    public static final String BAD_REQUEST_STR = "400";
    public static final int UNAUTHORIZED = 401;
    public static final String UNAUTHORIZED_STR = "401";
    public  static final int PAYMENT_REQUIRED = 402;
    public static final String PAYMENT_REQUIRED_STR = "402";
    public static final int FORBIDDEN = 403;
    public static final String FORBIDDEN_STR = "403";
    public static final int NOT_FOUND = 404;
    public static final String NOT_FOUND_STR = "404";
    public static final int METHOD_NOT_ALLOWED = 405;
    public static final String METHOD_NOT_ALLOWED_STR = "405";
    public static final int NOT_ACCEPTABLE = 406;
    public static final String NOT_ACCEPTABLE_STR = "406";
    public static final int CONFLICT = 409;
    public static final String CONFLICT_STR = "409";
    public static final int GONE = 410;
    public static final String GONE_STR = "410";
    public static final int LENGTH_REQUIRED = 411;
    public static final String LENGTH_REQUIRED_STR = "411";
    public static final int UNSUPPORTED_MEDIA_TYPE = 415;
    public static final String UNSUPPORTED_MEDIA_TYPE_STR = "415";

    public static final int INTERNAL_SERVER_ERROR = 500;
    public static final String INTERNAL_SERVER_ERROR_STR = "500";
    public static final int NOT_IMPLEMENTED = 501;
    public static final String NOT_IMPLEMENTED_STR = "501";
    public static final int BAD_GATEWAY = 502;
    public static final String BAD_GATEWAY_STR = "502";
    public static final int SERVICE_UNAVAILABLE = 503;
    public static final String SERVICE_UNAVAILABLE_STR = "503";
    public static final int GATEWAY_TIMEOUT = 504;
    public static final String GATEWAY_TIMEOUT_STR = "504";
    public static final int HTTP_VERSION_NOT_SUPPORTED = 505;
    public static final String HTTP_VERSION_NOT_SUPPORTED_STR = "505";

    // Prevent instantiation
    private HttpStatusUtil() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Returns a MessageType according to the HTTP status code.
     *
     * @param statusCode HTTP status code
     * @return MessageType
     */
    public static MessageType getMessageType(int statusCode) {
        return switch (statusCode) {
            // 1xx Informational
            case CONTINUE -> InformationCode.CONTINUE;
            case SWITCHING_PROTOCOLS -> InformationCode.SWITCHING_PROTOCOLS;
            case PROCESSING -> InformationCode.PROCESSING;
            // 2xx Success
            case OK -> SuccessKey.OK;
            case CREATED -> SuccessKey.CREATED;
            case ACCEPTED -> SuccessKey.ACCEPTED;
            case NO_CONTENT -> SuccessKey.NO_CONTENT;
            // 3xx Redirection
            case MULTIPLE_CHOICES -> RedirectionKey.MULTIPLE_CHOICES;
            case MOVED_PERMANENTLY -> RedirectionKey.MOVED_PERMANENTLY;
            case FOUND -> RedirectionKey.FOUND;
            case SEE_OTHER -> RedirectionKey.SEE_OTHER;
            case NOT_MODIFIED -> RedirectionKey.NOT_MODIFIED;
            // 4xx Client Error
            case BAD_REQUEST -> ClientErrorKey.BAD_REQUEST;
            case UNAUTHORIZED -> ClientErrorKey.UNAUTHORIZED;
            case PAYMENT_REQUIRED -> ClientErrorKey.PAYMENT_REQUIRED;
            case FORBIDDEN -> ClientErrorKey.FORBIDDEN;
            case NOT_FOUND -> ClientErrorKey.NOT_FOUND;
            case METHOD_NOT_ALLOWED -> ClientErrorKey.METHOD_NOT_ALLOWED;
            case NOT_ACCEPTABLE -> ClientErrorKey.NOT_ACCEPTABLE;
            case CONFLICT -> ClientErrorKey.CONFLICT;
            case GONE -> ClientErrorKey.GONE;
            case LENGTH_REQUIRED -> ClientErrorKey.LENGTH_REQUIRED;
            case UNSUPPORTED_MEDIA_TYPE -> ClientErrorKey.UNSUPPORTED_MEDIA_TYPE;
            // 5xx Server Error
            case INTERNAL_SERVER_ERROR -> ServerErrorKey.INTERNAL_SERVER_ERROR;
            case NOT_IMPLEMENTED -> ServerErrorKey.NOT_IMPLEMENTED;
            case BAD_GATEWAY -> ServerErrorKey.BAD_GATEWAY;
            case SERVICE_UNAVAILABLE -> ServerErrorKey.SERVICE_UNAVAILABLE;
            case GATEWAY_TIMEOUT -> ServerErrorKey.GATEWAY_TIMEOUT;
            case HTTP_VERSION_NOT_SUPPORTED -> ServerErrorKey.HTTP_VERSION_NOT_SUPPORTED;
            default -> MessageType.DEFAULT_MESSAGE;
        };
    }
}
