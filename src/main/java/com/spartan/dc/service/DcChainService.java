package com.spartan.dc.service;

import com.spartan.dc.core.datatables.DataTable;
import com.spartan.dc.model.DcChain;

import java.util.List;
import java.util.Map;

/**
 * Desc：
 *
 * @Created by 2022-07-16 20:29
 */
public interface DcChainService {

    Map<String, Object> queryChainList(DataTable<Map<String, Object>> dataTable);

    DcChain selectByPrimaryKey(Long chainId);

    List<DcChain> getOpbChainList();
}
