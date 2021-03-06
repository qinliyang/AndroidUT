package com.zl.weilu.androidut.mvp.ui

import com.zl.weilu.androidut.mvp.base.MvpView

/**
 * Created by weilu on 2018/1/27.
 */

interface LoginMvpView : MvpView {

    /**
     * 倒计时完成
     */
    fun countdownComplete()

    /**
     * 倒计时中
     * @param time 剩余时间
     */
    fun countdownNext(time: String)

    /**
     * 登录成功
     */
    fun loginSuccess()

}
