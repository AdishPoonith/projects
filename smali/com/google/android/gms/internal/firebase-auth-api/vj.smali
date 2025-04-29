.class public Lcom/google/android/gms/internal/firebase-auth-api/vj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

.field private final b:Ljava/lang/Class;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/gv;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/uj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/vj;->a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/vj;->b:Ljava/lang/Class;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/firebase-auth-api/tj;Lcom/google/android/gms/internal/firebase-auth-api/gv;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/vj;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/sj;

    invoke-direct {v0, p1, p2, p0}, Lcom/google/android/gms/internal/firebase-auth-api/sj;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/gv;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/tj;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/firebase-auth-api/gv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/vj;->a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/vj;->b:Ljava/lang/Class;

    return-object v0
.end method
