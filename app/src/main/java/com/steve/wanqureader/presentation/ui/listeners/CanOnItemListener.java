package com.steve.wanqureader.presentation.ui.listeners;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

/**
 * Copyright 2016 canyinghao
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class CanOnItemListener {

    public void onItemChildClick(View view, int position) {
    }

    public boolean onItemChildLongClick(View view, int position) {
        return false;
    }

    public void onItemChildCheckedChanged(CompoundButton view, int position, boolean isChecked) {
    }

    public void onRVItemClick(ViewGroup parent, View itemView, int position) {
    }

    public boolean onRVItemLongClick(ViewGroup parent, View itemView, int position) {
        return false;
    }
}
