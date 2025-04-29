.class public abstract Lcom/google/android/gms/internal/firebase-auth-api/aj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

.field private final b:Ljava/lang/Class;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/gv;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/aj;->a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/aj;->b:Ljava/lang/Class;

    return-void
.end method

.method public static b(Lcom/google/android/gms/internal/firebase-auth-api/yi;Lcom/google/android/gms/internal/firebase-auth-api/gv;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/aj;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/wi;

    invoke-direct {v0, p1, p2, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wi;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/gv;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/yi;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Lcom/google/android/gms/internal/firebase-auth-api/ok;Lcom/google/android/gms/internal/firebase-auth-api/hb;)Lcom/google/android/gms/internal/firebase-auth-api/aa;
.end method

.method public final c()Lcom/google/android/gms/internal/firebase-auth-api/gv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/aj;->a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    return-object v0
.end method

.method public final d()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/aj;->b:Ljava/lang/Class;

    return-object v0
.end method
