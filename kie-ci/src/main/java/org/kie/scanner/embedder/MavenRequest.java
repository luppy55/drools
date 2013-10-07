package org.kie.scanner.embedder;

import org.apache.maven.execution.ExecutionListener;
import org.apache.maven.execution.MavenExecutionRequest;
import org.apache.maven.model.building.ModelBuildingRequest;
import org.codehaus.plexus.PlexusConstants;
import org.codehaus.plexus.logging.LoggerManager;
import org.sonatype.aether.repository.WorkspaceReader;
import org.sonatype.aether.transfer.TransferListener;

import java.net.URL;
import java.util.List;
import java.util.Properties;

public class MavenRequest {

    private String globalSettingsFile;
    
    private String userSettingsFile;
    
    private String localRepositoryPath;
    
    private boolean offline;
    
    private TransferListener transferListener;
    
    private String baseDirectory;
    
    private List<String> goals;
    
    private Properties systemProperties;
    
    private Properties userProperties;
    
    private String failureBehavior;
    
    private List<String> selectedProjects;
    
    private String resumeFromProject;
    
    private String makeBehavior;
    
    private String threadCount;
    
    private boolean recursive;
    
    private String pom;
    
    private boolean showErrors;

    private int loggingLevel = MavenExecutionRequest.LOGGING_LEVEL_INFO;
    
    private boolean updateSnapshots;
    
    private boolean noSnapshotUpdates;
    
    private String globalChecksumPolicy;
    
    private boolean interactive;
    
    private boolean cacheTransferError = true;
    
    private boolean cacheNotFound = true;
    
    private List<String> profiles;
    
    private ExecutionListener executionListener;
    
    private WorkspaceReader workspaceReader;
    
    private LoggerManager mavenLoggerManager;
    
    private URL overridingComponentsXml;
    
    private boolean processPlugins;
    
    private boolean resolveDependencies;
    
    private int validationLevel = ModelBuildingRequest.VALIDATION_LEVEL_MAVEN_2_0;
    
    private boolean containerAutoWiring = false;

    private String containerComponentVisibility = PlexusConstants.REALM_VISIBILITY;

    private String containerClassPathScanning = PlexusConstants.SCANNING_OFF;
    
    public MavenRequest() { }

    public String getGlobalSettingsFile() {
        return globalSettingsFile;
    }

    public MavenRequest setGlobalSettingsFile( String globalSettingsFile ) {
        this.globalSettingsFile = globalSettingsFile;
        return this;
    }

    public String getUserSettingsFile() {
        return userSettingsFile;
    }

    public MavenRequest setUserSettingsFile( String userSettingsFile ) {
        this.userSettingsFile = userSettingsFile;
        return this;
    }

    public String getLocalRepositoryPath() {
        return localRepositoryPath;
    }

    public MavenRequest setLocalRepositoryPath( String localRepositoryPath ) {
        this.localRepositoryPath = localRepositoryPath;
        return this;
    }

    public boolean isOffline() {
        return offline;
    }

    public MavenRequest setOffline( boolean offline ) {
        this.offline = offline;
        return this;
    }

    public TransferListener getTransferListener() {
        return transferListener;
    }

    public MavenRequest setTransferListener( TransferListener transferListener ) {
        this.transferListener = transferListener;
        return this;
    }

    public String getBaseDirectory() {
        return baseDirectory;
    }

    public MavenRequest setBaseDirectory( String baseDirectory ) {
        this.baseDirectory = baseDirectory;
        return this;
    }

    public List<String> getGoals() {
        return goals;
    }

    public MavenRequest setGoals( List<String> goals ) {
        this.goals = goals;
        return this;
    }

    public Properties getSystemProperties() {
        if (this.systemProperties == null) {
            this.systemProperties = new Properties();
            this.systemProperties.putAll( System.getProperties() );
        }
        return systemProperties;
    }

    public MavenRequest setSystemProperties( Properties systemProperties ) {
        this.systemProperties = systemProperties;
        return this;
    }

    public Properties getUserProperties() {
        if (this.userProperties == null) {
            this.userProperties = new Properties();
        }        
        return userProperties;
    }

    public MavenRequest setUserProperties( Properties userProperties ) {
        this.userProperties = userProperties;
        return this;
    }

    public String getFailureBehavior() {
        return failureBehavior;
    }

    public MavenRequest setFailureBehavior( String failureBehavior ) {
        this.failureBehavior = failureBehavior;
        return this;
    }

    public List<String> getSelectedProjects() {
        return selectedProjects;
    }

    public MavenRequest setSelectedProjects( List<String> selectedProjects ) {
        this.selectedProjects = selectedProjects;
        return this;
    }

    public String getResumeFromProject() {
        return resumeFromProject;
    }

    public MavenRequest setResumeFromProject( String resumeFromProject ) {
        this.resumeFromProject = resumeFromProject;
        return this;
    }

    public String getMakeBehavior() {
        return makeBehavior;
    }

    public MavenRequest setMakeBehavior( String makeBehavior ) {
        this.makeBehavior = makeBehavior;
        return this;
    }

    public String getThreadCount() {
        return threadCount;
    }

    public MavenRequest setThreadCount( String threadCount ) {
        this.threadCount = threadCount;
        return this;
    }

    public boolean isRecursive() {
        return recursive;
    }

    public MavenRequest setRecursive( boolean recursive ) {
        this.recursive = recursive;
        return this;
    }

    public String getPom() {
        return pom;
    }

    public MavenRequest setPom( String pom ) {
        this.pom = pom;
        return this;
    }

    public boolean isShowErrors() {
        return showErrors;
    }

    public MavenRequest setShowErrors( boolean showErrors ) {
        this.showErrors = showErrors;
        return this;
    }

    public int getLoggingLevel() {
        return loggingLevel;
    }

    public MavenRequest setLoggingLevel( int loggingLevel ) {
        this.loggingLevel = loggingLevel;
        return this;
    }

    public boolean isUpdateSnapshots() {
        return updateSnapshots;
    }

    public MavenRequest setUpdateSnapshots( boolean updateSnapshots ) {
        this.updateSnapshots = updateSnapshots;
        return this;
    }

    public boolean isNoSnapshotUpdates() {
        return noSnapshotUpdates;
    }

    public MavenRequest setNoSnapshotUpdates( boolean noSnapshotUpdates ) {
        this.noSnapshotUpdates = noSnapshotUpdates;
        return this;
    }

    public String getGlobalChecksumPolicy() {
        return globalChecksumPolicy;
    }

    public MavenRequest setGlobalChecksumPolicy( String globalChecksumPolicy ) {
        this.globalChecksumPolicy = globalChecksumPolicy;
        return this;
    }

    public boolean isInteractive() {
        return interactive;
    }

    public MavenRequest setInteractive( boolean interactive ) {
        this.interactive = interactive;
        return this;
    }

    public boolean isCacheTransferError() {
        return cacheTransferError;
    }

    public MavenRequest setCacheTransferError( boolean cacheTransferError ) {
        this.cacheTransferError = cacheTransferError;
        return this;
    }

    public boolean isCacheNotFound() {
        return cacheNotFound;
    }

    public MavenRequest setCacheNotFound( boolean cacheNotFound ) {
        this.cacheNotFound = cacheNotFound;
        return this;
    }

    public List<String> getProfiles() {
        return profiles;
    }

    public MavenRequest setProfiles( List<String> profiles ) {
        this.profiles = profiles;
        return this;
    }

    public ExecutionListener getExecutionListener() {
        return executionListener;
    }

    public MavenRequest setExecutionListener( ExecutionListener executionListener ) {
        this.executionListener = executionListener;
        return this;
    }

    public WorkspaceReader getWorkspaceReader() {
        return workspaceReader;
    }

    public MavenRequest setWorkspaceReader( WorkspaceReader workspaceReader ) {
        this.workspaceReader = workspaceReader;
        return this;
    }

    public LoggerManager getMavenLoggerManager() {
        return mavenLoggerManager;
    }

    public MavenRequest setMavenLoggerManager( LoggerManager mavenLoggerManager ) {
        this.mavenLoggerManager = mavenLoggerManager;
        return this;
    }

    public URL getOverridingComponentsXml() {
        return overridingComponentsXml;
    }

    public MavenRequest setOverridingComponentsXml( URL overridingComponentsXml ) {
        this.overridingComponentsXml = overridingComponentsXml;
        return this;
    }

    public boolean isProcessPlugins() {
        return processPlugins;
    }

    public MavenRequest setProcessPlugins( boolean processPlugins ) {
        this.processPlugins = processPlugins;
        return this;
    }

    public boolean isResolveDependencies() {
        return resolveDependencies;
    }

    public MavenRequest setResolveDependencies( boolean resolveDependencies ) {
        this.resolveDependencies = resolveDependencies;
        return this;
    }

    public int getValidationLevel()
    {
        return validationLevel;
    }

    public MavenRequest setValidationLevel( int validationLevel )
    {
        this.validationLevel = validationLevel;
        return this;
    }

    public boolean isContainerAutoWiring()
    {
        return containerAutoWiring;
    }

    public void setContainerAutoWiring( boolean containerAutoWiring )
    {
        this.containerAutoWiring = containerAutoWiring;
    }

    public String getContainerComponentVisibility()
    {
        return containerComponentVisibility;
    }

    public void setContainerComponentVisibility( String containerComponentVisibility )
    {
        this.containerComponentVisibility = containerComponentVisibility;
    }

    public String getContainerClassPathScanning()
    {
        return containerClassPathScanning;
    }

    public void setContainerClassPathScanning( String containerClassPathScanning )
    {
        this.containerClassPathScanning = containerClassPathScanning;
    }

}