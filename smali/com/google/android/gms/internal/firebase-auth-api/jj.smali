.class public final Lcom/google/android/gms/internal/firebase-auth-api/jj;
.super Lcom/google/android/gms/internal/firebase-auth-api/aa;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/mk;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/mk;Lcom/google/android/gms/internal/firebase-auth-api/hb;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/aa;-><init>()V

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/ij;->b:[I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mk;->b()Lcom/google/android/gms/internal/firebase-auth-api/ur;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p2, p2, v0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/jj;->a:Lcom/google/android/gms/internal/firebase-auth-api/mk;

    return-void
.end method
