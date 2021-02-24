package se.payerl.haws.types;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
public class Result {
    private Context context;
    private double latitude;
    private double longitude;
    private int elevation;
    @JsonIgnoreProperties(ignoreUnknown = true)
//    @JsonProperty("unit_system")
    private UnitSystem unitSystem;
//    @JsonProperty("location_name")
    private String locationName;
//    @JsonProperty("time_zone")
    private String timeZone;
    private List<String> components;
//    @JsonProperty("config_dir")
    private String configDir;
//    @JsonProperty("whitelist_external_dirs")
    private List<String> whitelistExternalDirs;
//    @JsonProperty("allowlist_external_dirs")
    private List<String> allowlistExternalDirs;
//    @JsonProperty("allowlist_external_urls")
    private List<String> allowlistExternalUrls;
    private String version;
//    @JsonProperty("config_source")
    private String configSource;
//    @JsonProperty("safe_mode")
    private boolean safeMode;
    private String state;
//    @JsonProperty("external_url")
    private String externalUrl;
//    @JsonProperty("internal_url")
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