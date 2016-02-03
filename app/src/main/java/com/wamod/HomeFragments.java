package com.wamod;

import android.app.ListFragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by brianvalente on 12/20/15.
 */
public class HomeFragments {
    public static void ConversationsFragment(View a) {
        if (utils.darkMode()) {
            TextView chatNameTV = (TextView) a.findViewById(id.conversations_row_contact_name);
            TextView dateTV = (TextView) a.findViewById(id.conversations_row_date);
            TextView msgTV = (TextView) a.findViewById(id.single_msg_tv);
            TextView senderTV = (TextView) a.findViewById(id.msg_from_tv);

            chatNameTV.setTextColor(utils.getDarkColor(0));
            dateTV.setTextColor(utils.getDarkColor(1));
            msgTV.setTextColor(utils.getDarkColor(1));
            senderTV.setTextColor(utils.getDarkColor(1));
        }
    }

    public static void CallsFragment(View a) {
        if (utils.darkMode()) {
            TextView contactNameTV = (TextView) a.findViewById(id.contact_name);
            TextView dateTV = (TextView) a.findViewById(id.date_time);

            contactNameTV.setTextColor(utils.getDarkColor(0));
            dateTV.setTextColor(utils.getDarkColor(1));
        }
    }

    public static void ContactsFragment(View a) {
        if (utils.darkMode()) {
            TextView contactNameTV = (TextView) a.findViewById(id.contactpicker_row_name);
            TextView statusTV = (TextView) a.findViewById(id.contactpicker_row_status);
            TextView phoneTypeTV = (TextView) a.findViewById(id.contactpicker_row_phone_type);

            contactNameTV.setTextColor(utils.getDarkColor(0));
            statusTV.setTextColor(utils.getDarkColor(1));
            phoneTypeTV.setTextColor(utils.getDarkColor(1));
        }
    }
}
