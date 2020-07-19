package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTest {

    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    @Test
    public void shouldCreateNewFileInTemporaryFolder() throws  Exception{
        File created = tmpFolder.newFile("file.txt");

        assertTrue(created.isFile());
        assertEquals(tmpFolder.getRoot(), created.getParentFile());
    }
}
