package com.example.myapplicationk

import android.os.Parcel
import android.os.Parcelable

data class fotokls(val image:Int, val name:String) :Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<fotokls> {
        override fun createFromParcel(parcel: Parcel): fotokls {
            return fotokls(parcel)
        }

        override fun newArray(size: Int): Array<fotokls?> {
            return arrayOfNulls(size)
        }
    }
}

