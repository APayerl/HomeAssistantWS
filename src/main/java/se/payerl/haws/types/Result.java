package se.payerl.haws.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

//@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
public class Result {
    private Context context;
    private double latitude;
    private double longitude;
    private int elevation;
//    @JsonIgnoreProperties(ignoreUnknown = true)
    private UnitSystem unitSystem;
    private String locationName;
    private String timeZone;
    private List<String> components;
    private String configDir;
    private List<String> whitelistExternalDirs;
    private List<String> allowlistExternalDirs;
    private List<String> allowlistExternalUrls;
    private String version;
    private String configSource;
    private boolean safeMode;
    private String state;
    private String externalUrl;
    private String internalUrl;

    public Context getContext() {
        return context;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getElevation() {
        return elevation;
    }

    public UnitSystem getUnitSystem() {
        return unitSystem;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public List<String> getComponents() {
        return components;
    }

    public String getConfigDir() {
        return configDir;
    }

    public List<String> getWhitelistExternalDirs() {
        return whitelistExternalDirs;
    }

    public List<String> getAllowlistExternalDirs() {
        return allowlistExternalDirs;
    }

    public List<String> getAllowlistExternalUrls() {
        return allowlistExternalUrls;
    }

    public String getVersion() {
        return version;
    }

    public String getConfigSource() {
        return configSource;
    }

    public boolean isSafeMode() {
        return safeMode;
    }

    public String getState() {
        return state;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public String getInternalUrl() {
        return internalUrl;
    }

    public Result setContext(Context context) {
        this.context = context;
        return this;
    }

    public Result setLatitude(double latitude) {
        this.latitude = latitude;
        return this;
    }

    public Result setLongitude(double longitude) {
        this.longitude = longitude;
        return this;
    }

    public Result setElevation(int elevation) {
        this.elevation = elevation;
        return this;
    }

    public Result setUnitSystem(UnitSystem unitSystem) {
        this.unitSystem = unitSystem;
        return this;
    }

    public Result setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }

    public Result setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public Result setComponents(List<String> components) {
        this.components = components;
        return this;
    }

    public Result setConfigDir(String configDir) {
        this.configDir = configDir;
        return this;
    }

    public Result setWhitelistExternalDirs(List<String> whitelistExternalDirs) {
        this.whitelistExternalDirs = whitelistExternalDirs;
        return this;
    }

    public Result setAllowlistExternalDirs(List<String> allowlistExternalDirs) {
        this.allowlistExternalDirs = allowlistExternalDirs;
        return this;
    }

    public Result setAllowlistExternalUrls(List<String> allowlistExternalUrls) {
        this.allowlistExternalUrls = allowlistExternalUrls;
        return this;
    }

    public Result setVersion(String version) {
        this.version = version;
        return this;
    }

    public Result setConfigSource(String configSource) {
        this.configSource = configSource;
        return this;
    }

    public Result setSafeMode(boolean safeMode) {
        this.safeMode = safeMode;
        return this;
    }

    public Result setState(String state) {
        this.state = state;
        return this;
    }

    public Result setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
        return this;
    }

    public Result setInternalUrl(String internalUrl) {
        this.internalUrl = internalUrl;
        return this;
    }
}