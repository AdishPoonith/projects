.class public abstract Lcom/google/android/gms/internal/firebase-auth-api/gj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/gj;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/android/gms/internal/firebase-auth-api/w6;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
.end method

.method public abstract b(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
.end method

.method public c()Ljava/util/Map;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public abstract d(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V
.end method

.method public final e()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/gj;->a:Ljava/lang/Class;

    return-object v0
.end method
