package com.yiitz.webtpl.protocol;

import lombok.Data;

@Data
public class Result {
  int code;
  String msg;
  Object data;

  public static final int ServiceCode = 10;
  public static final int ServicePadding = 100000;

  public static final int ErrorBBadRequest = 400;
  public static final int ErrorBUnauthrize = 401;
  public static final int ErrorBForbidden = 403;
  public static final int ErrorBNotFound = 404;
  public static final int ErrorBInternal = 500;
  public static final int ErrorBNotSupport = 501;
  public static final int ErrorBPadding = 100;

  public static final int ErrorCodeBadRequest = ServiceCode * ServicePadding + ErrorBBadRequest * ErrorBPadding;
  public static final int ErrorCodeIllegalArg = ErrorCodeBadRequest + 1;
  public static final int ErrorCodeUnauthrize = ServiceCode * ServicePadding + ErrorBUnauthrize * ErrorBPadding;
  public static final int ErrorCodeForbidden = ServiceCode * ServicePadding + ErrorBForbidden * ErrorBPadding;
  public static final int ErrorCodeNotFound = ServiceCode * ServicePadding + ErrorBNotFound * ErrorBPadding;
  public static final int ErrorCodeInternal = ServiceCode * ServicePadding + ErrorBInternal * ErrorBPadding;

  public static Result ok(Object data) {
    Result result = new Result();
    result.data = data;
    return result;
  }

  public static Result error(int code, String msg) {
    Result result = new Result();
    result.code = code;
    result.msg = msg;
    return result;
  }

  public static Result errorBadRequest(String msg) {
    Result result = new Result();
    result.code = ErrorCodeBadRequest;
    result.msg = msg;
    return result;
  }

  public static Result errorIllegalArg(String msg) {
    Result result = new Result();
    result.code = ErrorCodeIllegalArg;
    result.msg = msg;
    return result;
  }

  public static Result errorForbidden(String msg) {
    Result result = new Result();
    result.code = ErrorCodeForbidden;
    result.msg = msg;
    return result;
  }

  public static Result errorNotFound(String msg) {
    Result result = new Result();
    result.code = ErrorCodeNotFound;
    result.msg = msg;
    return result;
  }

  public static Result errorInternal(String msg) {
    Result result = new Result();
    result.code = ErrorCodeInternal;
    result.msg = msg;
    return result;
  }
}
