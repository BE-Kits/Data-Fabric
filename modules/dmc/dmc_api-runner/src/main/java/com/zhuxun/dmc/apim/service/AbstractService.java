package com.zhuxun.dmc.apim.service;

import com.zhuxun.dmc.apim.repository.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractService {

  @Autowired protected DcProjectMapper dcProjectMapper;

  @Autowired protected DcProjectDocMapper dcProjectDocMapper;

  @Autowired protected DcProjectTypeMapper dcProjectTypeMapper;

  @Autowired protected DcFolderMapper dcFolderMapper;

  @Autowired protected DcApiMapper dcApiMapper;

  @Autowired protected DcApiImplMapper dcApiImplMapper;

  @Autowired protected DcApiParamMapper dcApiParamMapper;

  @Autowired protected DcApiResponseMapper dcApiResponseMapper;

  @Autowired protected DcUserApiMapper dcUserApiMapper;

  @Autowired protected DcApiDocMapper dcApiDocMapper;

  @Autowired protected DcEnvironmentMapper dcEnvironmentMapper;

  @Autowired protected DcDatasourceMapper dcDatasourceMapper;

  @Autowired protected DcDataSchemaMapper dcDataSchemaMapper;

  @Autowired protected DcDataTableMapper dcDataTableMapper;

  @Autowired protected DcDataColumnMapper dcDataColumnMapper;

  @Autowired protected DcProjectDynamicMapper dcProjectDynamicMapper;

  @Autowired protected DcUserSchemaMapper dcUserSchemaMapper;
}
