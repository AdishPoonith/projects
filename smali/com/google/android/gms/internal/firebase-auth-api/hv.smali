.class public final Lcom/google/android/gms/internal/firebase-auth-api/hv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/gv;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/gv;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hv;->a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    return-void
.end method

.method public static b([BLcom/google/android/gms/internal/firebase-auth-api/hb;)Lcom/google/android/gms/internal/firebase-auth-api/hv;
    .locals 0

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/hv;

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/gv;->b([B)Lcom/google/android/gms/internal/firebase-auth-api/gv;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/hv;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/gv;)V

    return-object p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hv;->a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/gv;->a()I

    move-result v0

    return v0
.end method
