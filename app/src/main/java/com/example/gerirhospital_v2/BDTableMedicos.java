package com.example.gerirhospital_v2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class BDTableMedicos implements BaseColumns {
    public static final String NOME_TABELA = "Medicos";
    public static final String CAMPO_NIF = "NIF";
    public static final String CAMPO_Idade = "Idade";
    public static final String CAMPO_Nacionalidade = "Nacionalidade";
    public static final String CAMPO_Distrito = "Distrito";
    public static final String CAMPO_Conchelho = "Concelho";
    public static final String CAMPO_Cidade = "Cidade";
    public static final String CAMPO_Ordenado = "Ordenado";
    public static final String CAMPO_Contacto = "Contacto";

    public static final String CAMPO_NIF_Completo = NOME_TABELA + "." + CAMPO_NIF;
    public static final String CAMPO_Idade_Completo = NOME_TABELA + "." + CAMPO_Idade;
    public static final String CAMPO_Nacionalidade_COMPLETO = NOME_TABELA + "." + CAMPO_Nacionalidade;
    public static final String CAMPO_Distrito_COMPLETO = NOME_TABELA + "." + CAMPO_Distrito;
    public static final String CAMPO_Concelho_COMPLETO = NOME_TABELA + "." + CAMPO_Conchelho;
    public static final String CAMPO_Cidade_COMPLETO = NOME_TABELA + "." + CAMPO_Cidade;
    public static final String CAMPO_Ordenado_COMPLETO = NOME_TABELA + "." + CAMPO_Ordenado;
    public static final String CAMPO_Contacto_COMPLETO = NOME_TABELA + "." + CAMPO_Contacto;



    public static final String[] TODOS_CAMPOS = {_ID, CAMPO_NIF,CAMPO_Idade,CAMPO_Nacionalidade,CAMPO_Distrito,CAMPO_Conchelho,CAMPO_Cidade,CAMPO_Ordenado,CAMPO_Contacto};

    private SQLiteDatabase db;

    public BDTableMedicos(SQLiteDatabase db) {
        this.db = db;
    }


    public void cria() {
        db.execSQL(
                "CREATE TABLE " + NOME_TABELA + " (" +
                        CAMPO_NIF + " INTEGER PRIMARY KEY," +
                        CAMPO_Idade + " INTEGER NOT NULL," +
                        CAMPO_Nacionalidade + "STRING NOT NULL," +
                        CAMPO_Distrito + "STRING NOT NULL," +
                        CAMPO_Conchelho + "STRING NOT NULL," +
                        CAMPO_Ordenado + "INTEGER NOT NULL," +
                        CAMPO_Contacto + "INTEGER NOT NULL" +
                        ")");
    }

  //
    public long insert(ContentValues values) {
        return db.insert(NOME_TABELA, null, values);
    }



    public Cursor query(String[] columns, String selection,
                        String[] selectionArgs, String groupBy, String having,
                        String orderBy) {
        return db.query(NOME_TABELA, columns, selection, selectionArgs, groupBy, having, orderBy);
    }


    public int update(ContentValues values, String whereClause, String[] whereArgs) {
        return db.update(NOME_TABELA, values, whereClause, whereArgs);
    }


 public int delete(String whereClause, String[] whereArgs) {
        return db.delete(NOME_TABELA, whereClause, whereArgs);
    }

}
