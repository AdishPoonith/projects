.class public final Lcom/google/android/gms/internal/auth/e5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/u0;


# static fields
.field private static final k:Lcom/google/android/gms/internal/auth/e5;


# instance fields
.field private final j:Lcom/google/android/gms/internal/auth/u0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/e5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/e5;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/e5;->k:Lcom/google/android/gms/internal/auth/e5;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/h5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/h5;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/y0;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/auth/u0;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/y0;->a(Lcom/google/android/gms/internal/auth/u0;)Lcom/google/android/gms/internal/auth/u0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/auth/e5;->j:Lcom/google/android/gms/internal/auth/u0;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/auth/d5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/e5;->k:Lcom/google/android/gms/internal/auth/e5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/e5;->b()Lcom/google/android/gms/internal/auth/f5;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/f5;->zza()Lcom/google/android/gms/internal/auth/d5;

    move-result-object v0

    return-object v0
.end method

.method public static c()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/e5;->k:Lcom/google/android/gms/internal/auth/e5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/e5;->b()Lcom/google/android/gms/internal/auth/f5;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/f5;->zzc()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/auth/f5;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e5;->j:Lcom/google/android/gms/internal/auth/u0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/u0;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/auth/f5;

    return-object v0
.end method

.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/e5;->b()Lcom/google/android/gms/internal/auth/f5;

    move-result-object v0

    return-object v0
.end method
