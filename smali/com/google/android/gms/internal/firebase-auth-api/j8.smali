.class public final Lcom/google/android/gms/internal/firebase-auth-api/j8;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lcom/google/android/gms/internal/firebase-auth-api/d6;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final j:Lcom/google/android/gms/internal/firebase-auth-api/d6;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/d6;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/j8;->j:Lcom/google/android/gms/internal/firebase-auth-api/d6;

    return-void
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/j8;)Lcom/google/android/gms/internal/firebase-auth-api/d6;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j8;->j:Lcom/google/android/gms/internal/firebase-auth-api/d6;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j8;->j:Lcom/google/android/gms/internal/firebase-auth-api/d6;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/c6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/c6;->e(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/h8;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/h8;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/j8;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/g8;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/g8;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/j8;I)V

    return-object v0
.end method

.method public final n(Lcom/google/android/gms/internal/firebase-auth-api/m4;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j8;->j:Lcom/google/android/gms/internal/firebase-auth-api/d6;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final zze()Lcom/google/android/gms/internal/firebase-auth-api/d6;
    .locals 0

    return-object p0
.end method

.method public final zzf(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j8;->j:Lcom/google/android/gms/internal/firebase-auth-api/d6;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/d6;->zzf(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzh()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j8;->j:Lcom/google/android/gms/internal/firebase-auth-api/d6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/d6;->zzh()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
