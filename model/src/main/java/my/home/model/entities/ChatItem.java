/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package my.home.model.entities;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Entity mapped to table CHAT_ITEM.
 */
public class ChatItem implements Parcelable {

    private Long id;
    /**
     * Not-null value.
     */
    private String content;
    private int type;
    private int state;
    private int seq;
    private java.util.Date date;

    public ChatItem() {
    }

    public ChatItem(Long id) {
        this.id = id;
    }

    public ChatItem(Long id, String content, int type, int state, int seq, java.util.Date date) {
        this.id = id;
        this.content = content;
        this.type = type;
        this.state = state;
        this.seq = seq;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getContent() {
        return content;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public boolean isMe() {
        if (this.getType() == ChatItemConstants.TYPE_ME) {
            return true;
        }
        return false;
    }

    public boolean isServer() {
        if (this.getType() == ChatItemConstants.TYPE_SERVER) {
            return true;
        }
        return false;
    }
//
//    public boolean isMeImageItem() {
//        if (this.getType() == ChatItemConstants.TYPE_ME_IMAGE) {
//            return true;
//        }
//        return false;
//    }

    public boolean isServerImageItem() {
        if (this.getType() == ChatItemConstants.TYPE_SERVER_IMAGE) {
            return true;
        }
        return false;
    }

    public boolean isServerLocItem() {
        if (this.getType() == ChatItemConstants.TYPE_SERVER_LOC) {
            return true;
        }
        return false;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    /*
        private String content;
        private boolean isMe;
        private int state;
        private int seq;
        private java.util.Date date;
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(content);
        dest.writeInt(type);
        dest.writeInt(state);
        dest.writeInt(seq);
        dest.writeLong(date.getTime());
    }

    public static final Parcelable.Creator<ChatItem> CREATOR = new Parcelable.Creator<ChatItem>() {

        @Override
        public ChatItem[] newArray(int size) {
            return new ChatItem[size];
        }

        @Override
        public ChatItem createFromParcel(Parcel source) {
            return new ChatItem(source);
        }
    };

    private ChatItem(Parcel in) {
        setId(in.readLong());
        setContent(in.readString());
        setType(in.readInt());
        setState(in.readInt());
        setSeq(in.readInt());
        setDate(new java.util.Date(in.readLong()));
    }

    @Override
    public String toString() {
        return "info: " + id + "\n"
                + "content: " + content + "\n"
                + "type: " + type + "\n"
                + "state: " + state + "\n"
                + "seq: " + seq + "\n"
                + "date: " + date + "\n";
    }
}
