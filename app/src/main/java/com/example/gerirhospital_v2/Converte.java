package com.example.gerirhospital_v2;

import android.content.ContentValues;

public class Converte {
    public static ContentValues categoriaToContentValues(Categoria categoria) {
        ContentValues valores = new ContentValues();

        valores.put(BDTableMedicos.CAMPO_NIF, categoria.getDescricao());

        return valores;
    }

}
