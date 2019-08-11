package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author Hanxinzi
 * @date 2019/7/30
 */
@Api(value = "cms页面管理接口",description = "cms页面管理接口，提供页面的增、删、改、查")
public interface CmsPageControllerApi {
   //分页查询

    @ApiOperation("分页列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "页面",paramType = "path",dataType = "int"),
            @ApiImplicitParam(name = "size",value = "每页记录",paramType = "path",dataType = "int")
    })
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
