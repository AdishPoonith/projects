.class public final Lcom/google/android/gms/internal/firebase-auth-api/mh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/cb;


# static fields
.field private static final a:Lcom/google/android/gms/internal/firebase-auth-api/mh;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/mh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/mh;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/mh;->a:Lcom/google/android/gms/internal/firebase-auth-api/mh;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/mh;->a:Lcom/google/android/gms/internal/firebase-auth-api/mh;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->j(Lcom/google/android/gms/internal/firebase-auth-api/cb;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/bb;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/lh;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/lh;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/bb;)V

    return-object v0
.end method

.method public final zza()Ljava/lang/Class;
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/z9;

    return-object v0
.end method

.method public final zzb()Ljava/lang/Class;
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/z9;

    return-object v0
.end method
