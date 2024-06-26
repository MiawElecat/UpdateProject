/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.tabelmodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import vape.model.ModelPembelianSementara;

/**
 *
 * @author JUL
 */
public class TabelModelPembelianSementara extends AbstractTableModel {
    
    private List<ModelPembelianSementara> list = new ArrayList<>();
    
    public void tambahData (ModelPembelianSementara mod_pembeliansem){
        list.add( mod_pembeliansem);
        fireTableRowsInserted(list.size()-1, list.size()-1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData (int row, ModelPembelianSementara mod_pembeliansem){
        list.add( row,mod_pembeliansem);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil diperbarui");
    }
    public void hapusData (int index){
        list.remove( index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "Data Berhasil dihapus");
    }
    public void clear (){
        list.clear();
        fireTableDataChanged();
    }
    public void setData(List<ModelPembelianSementara>list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
        
    }
    public void setData(int index, ModelPembelianSementara mod_pembeliansem){
        list.set(index, mod_pembeliansem);
        fireTableRowsUpdated(index, index);
        
    }
    public ModelPembelianSementara getData(int index){
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] namaKolom = {"No","Kode Produk","Nama Produk","Harga","Jumlah","Subtotal Harga"};

    @Override
    public int getColumnCount() {
        return namaKolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0){
            return"   " + (rowIndex + 1);
        }else{
        switch (columnIndex-1){
        case 0:return list.get(rowIndex).getMod_dataproduk().getId_data_produk();
        case 1:return list.get(rowIndex).getMod_dataproduk().getNama_produk();
        case 2:return list.get(rowIndex).getMod_dataproduk().getHarga_jual();
        case 3:return list.get(rowIndex).getMod_detpembelian().getJumlah_pembelian();
        case 4:return list.get(rowIndex).getMod_detpembelian().getSubtotal_harga();
        
        default: return null;
            }
        }
    }
    public String getColumnName(int column){
        if (column == 0){
            return "   " + namaKolom[column];
        }else{
            return namaKolom[column];
        }
    }
}
