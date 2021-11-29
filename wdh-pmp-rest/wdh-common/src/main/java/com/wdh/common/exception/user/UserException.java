package com.wdh.common.exception.user;

import com.wdh.common.exception.base.BaseException;

/**
 * 用户信息异常类
 * 
 * @author txl
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
