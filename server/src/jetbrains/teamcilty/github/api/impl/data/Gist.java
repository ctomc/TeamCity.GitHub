/*
 * Copyright 2000-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jetbrains.teamcilty.github.api.impl.data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Tomaz Cerar (c) 2015 Red Hat Inc.
 */
/*
  "description": "the description for this gist",
  "public": true,
  "files": {
    "file1.txt": {
      "content": "String file contents"
    }
  }
 */
public class Gist {
  String description;
  boolean isPublic = true;
  Map<String, GistFile> files = new LinkedHashMap<>();

  public Gist(String description, boolean isPublic) {
    this.description = description;
    this.isPublic = isPublic;
  }

  public Gist addFile(String name,String content){
    files.put(name, new GistFile(content));
    return this;
  }

  public class GistFile{
    String content;

    public GistFile(String content) {
      this.content = content;
    }
  }
}
