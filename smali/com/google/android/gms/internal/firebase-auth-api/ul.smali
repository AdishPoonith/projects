.class public final Lcom/google/android/gms/internal/firebase-auth-api/ul;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/cb;


# static fields
.field private static final a:Lcom/google/android/gms/internal/firebase-auth-api/ul;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ul;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ul;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ul;->a:Lcom/google/android/gms/internal/firebase-auth-api/ul;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static b()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ul;->a:Lcom/google/android/gms/internal/firebase-auth-api/ul;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->j(Lcom/google/android/gms/internal/firebase-auth-api/cb;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/bb;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/bb;->a()Lcom/google/android/gms/internal/firebase-auth-api/xa;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/bb;->d()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/xa;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/xa;->d()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/tl;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/tl;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/bb;Lcom/google/android/gms/internal/firebase-auth-api/sl;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "no primary in primitive set"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza()Ljava/lang/Class;
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/rl;

    return-object v0
.end method

.method public final zzb()Ljava/lang/Class;
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/rl;

    return-object v0
.end method
