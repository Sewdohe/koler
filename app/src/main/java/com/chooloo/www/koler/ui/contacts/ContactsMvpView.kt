package com.chooloo.www.koler.ui.contacts

import com.chooloo.www.koler.data.Contact
import com.chooloo.www.koler.ui.list.ListMvpView

interface ContactsMvpView : ListMvpView {
    fun observe(): Any?
    fun openContact(contact: Contact)
}