.class public final Lcom/google/android/gms/internal/auth/p4;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lcom/google/android/gms/internal/auth/o2;


# instance fields
.field private final j:Lcom/google/android/gms/internal/auth/o2;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/auth/o2;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/p4;->j:Lcom/google/android/gms/internal/auth/o2;

    return-void
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/auth/p4;)Lcom/google/android/gms/internal/auth/o2;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/auth/p4;->j:Lcom/google/android/gms/internal/auth/o2;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/p4;->j:Lcom/google/android/gms/internal/auth/o2;

    check-cast v0, Lcom/google/android/gms/internal/auth/n2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/n2;->e(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/o4;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/auth/o4;-><init>(Lcom/google/android/gms/internal/auth/p4;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/n4;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/auth/n4;-><init>(Lcom/google/android/gms/internal/auth/p4;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/p4;->j:Lcom/google/android/gms/internal/auth/o2;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final zze()Lcom/google/android/gms/internal/auth/o2;
    .locals 0

    return-object p0
.end method

.method public final zzg()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/p4;->j:Lcom/google/android/gms/internal/auth/o2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/o2;->zzg()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
