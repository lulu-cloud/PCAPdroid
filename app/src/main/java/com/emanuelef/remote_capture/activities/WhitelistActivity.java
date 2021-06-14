/*
 * This file is part of PCAPdroid.
 *
 * PCAPdroid is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PCAPdroid is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with PCAPdroid.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2020-21 - Emanuele Faranda
 */

package com.emanuelef.remote_capture.activities;

import android.os.Bundle;

import com.emanuelef.remote_capture.R;
import com.emanuelef.remote_capture.fragments.AppsFragment;
import com.emanuelef.remote_capture.fragments.WhitelistFragment;

public class WhitelistActivity extends BaseActivity {
    private static final String TAG = "WhitelistActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle(R.string.whitelist);
        setContentView(R.layout.whitelist_activity);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.whitelist_fragment, new WhitelistFragment())
                .commit();
    }
}