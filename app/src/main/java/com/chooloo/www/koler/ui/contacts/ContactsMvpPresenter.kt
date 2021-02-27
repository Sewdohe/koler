package com.chooloo.www.koler.ui.contacts

import com.chooloo.www.koler.data.Contact
import com.chooloo.www.koler.ui.base.MvpPresenter

interface ContactsMvpPresenter<V : ContactsMvpView> : MvpPresenter<V> {
    fun onContactItemClick(contact: Contact)
    fun onContactItemLongClick(contact: Contact): Boolean
    fun onPermissionsBlocked()
}