.class final Lq4/y;
.super Lt4/u;
.source "SourceFile"


# instance fields
.field private final a:Lq4/u;


# direct methods
.method constructor <init>(Lq4/u;)V
    .locals 0

    invoke-direct {p0}, Lt4/u;-><init>()V

    iput-object p1, p0, Lq4/y;->a:Lq4/u;

    return-void
.end method

.method static bridge synthetic M(Lq4/y;)Lq4/u;
    .locals 0

    iget-object p0, p0, Lq4/y;->a:Lq4/u;

    return-object p0
.end method


# virtual methods
.method public final F2(Lcom/google/android/gms/location/LocationResult;)V
    .locals 2

    iget-object v0, p0, Lq4/y;->a:Lq4/u;

    invoke-interface {v0}, Lq4/u;->zza()Lcom/google/android/gms/common/api/internal/j;

    move-result-object v0

    new-instance v1, Lq4/v;

    invoke-direct {v1, p0, p1}, Lq4/v;-><init>(Lq4/y;Lcom/google/android/gms/location/LocationResult;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/j;->c(Lcom/google/android/gms/common/api/internal/j$b;)V

    return-void
.end method

.method final H2(Lcom/google/android/gms/common/api/internal/j;)Lq4/y;
    .locals 1

    iget-object v0, p0, Lq4/y;->a:Lq4/u;

    invoke-interface {v0, p1}, Lq4/u;->a(Lcom/google/android/gms/common/api/internal/j;)V

    return-object p0
.end method

.method public final K0(Lcom/google/android/gms/location/LocationAvailability;)V
    .locals 2

    iget-object v0, p0, Lq4/y;->a:Lq4/u;

    invoke-interface {v0}, Lq4/u;->zza()Lcom/google/android/gms/common/api/internal/j;

    move-result-object v0

    new-instance v1, Lq4/w;

    invoke-direct {v1, p0, p1}, Lq4/w;-><init>(Lq4/y;Lcom/google/android/gms/location/LocationAvailability;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/j;->c(Lcom/google/android/gms/common/api/internal/j$b;)V

    return-void
.end method

.method public final zzf()V
    .locals 2

    iget-object v0, p0, Lq4/y;->a:Lq4/u;

    invoke-interface {v0}, Lq4/u;->zza()Lcom/google/android/gms/common/api/internal/j;

    move-result-object v0

    new-instance v1, Lq4/x;

    invoke-direct {v1, p0}, Lq4/x;-><init>(Lq4/y;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/j;->c(Lcom/google/android/gms/common/api/internal/j$b;)V

    return-void
.end method

.method final zzh()V
    .locals 1

    iget-object v0, p0, Lq4/y;->a:Lq4/u;

    invoke-interface {v0}, Lq4/u;->zza()Lcom/google/android/gms/common/api/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/j;->a()V

    return-void
.end method
