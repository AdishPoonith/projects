.class final Lz3/l;
.super Lz3/e;
.source "SourceFile"


# instance fields
.field final synthetic a:Lz3/m;


# direct methods
.method constructor <init>(Lz3/m;)V
    .locals 0

    iput-object p1, p0, Lz3/l;->a:Lz3/m;

    invoke-direct {p0}, Lz3/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final h0(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lz3/l;->a:Lz3/m;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
