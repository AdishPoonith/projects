.class public final Lcom/google/android/gms/internal/firebase-auth-api/nv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/google/firebase/auth/o0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/firebase/auth/o0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/nv;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/nv;->b:Lcom/google/firebase/auth/o0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/firebase/auth/o0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/nv;->b:Lcom/google/firebase/auth/o0;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/nv;->a:Ljava/lang/String;

    return-object v0
.end method
