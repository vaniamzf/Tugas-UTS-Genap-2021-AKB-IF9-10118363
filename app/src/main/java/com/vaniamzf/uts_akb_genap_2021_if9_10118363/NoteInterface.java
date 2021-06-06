package com.vaniamzf.uts_akb_genap_2021_if9_10118363;

import android.database.Cursor;

import com.vaniamzf.uts_akb_genap_2021_if9_10118363.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}

// 6 Juni 2021 - 10118363 - Vania Yulianti Mozef - IF9