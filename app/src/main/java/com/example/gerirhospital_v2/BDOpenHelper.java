package com.example.gerirhospital_v2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BDOpenHelper extends SQLiteOpenHelper {
    public static final String NOME_BASE_DADOS = "GerirHospital.db";
    private static final int VERSAO_BASE_DADOS = 1;
    private static final boolean DESENVOLVIMENTO = true;

    public BDOpenHelper(@Nullable Context context) {
        super(context, NOME_BASE_DADOS, null, VERSAO_BASE_DADOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        BDTableMedicos tabelaMedicos = new BDTableMedicos(db);
        tabelaMedicos.cria();

      //  BDtableDoentes tabelaLivros = new BDtableDoentes (db);
      //  tabelaLivros.cria();

        if (DESENVOLVIMENTO) {
            seedData(db);
        }
    }

    private void seedData(SQLiteDatabase db) {
        BDTableMedicos tabelaCategorias = new BDTableMedicos(db);

        Categoria categoria = new Categoria();
        categoria.setDescricao("Ação");
        long idCatAcao = tabelaCategorias.insert(Converte.categoriaToContentValues(categoria));


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
