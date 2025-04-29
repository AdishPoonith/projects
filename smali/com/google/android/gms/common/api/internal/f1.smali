.class final Lcom/google/android/gms/common/api/internal/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic j:Lz4/l;

.field final synthetic k:Lcom/google/android/gms/common/api/internal/h1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/h1;Lz4/l;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/f1;->k:Lcom/google/android/gms/common/api/internal/h1;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/f1;->j:Lz4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/f1;->k:Lcom/google/android/gms/common/api/internal/h1;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/f1;->j:Lz4/l;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/h1;->J2(Lcom/google/android/gms/common/api/internal/h1;Lz4/l;)V

    return-void
.end method
