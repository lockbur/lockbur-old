
package com.aboutdata.service;

import com.aboutdata.domain.Tag;
import com.aboutdata.model.TagModel;
import com.aboutdata.rest.Page;
import com.aboutdata.rest.Pageable;

import java.util.List;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public interface TagService {

    public void create(Tag tag);

    public Tag getByName(String name);

    public List<String> findTagStringByName(String name);

    public List<TagModel> findTagsByName(String name);

    public Set<Tag> getTagsFromString(String tagString);

    public Page<TagModel> find(Pageable pageable);
}
