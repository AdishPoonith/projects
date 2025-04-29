.class final Lz3/n;
.super Lz3/e;
.source "SourceFile"


# instance fields
.field final synthetic a:Lz3/o;


# direct methods
.method constructor <init>(Lz3/o;)V
    .locals 0

    iput-object p1, p0, Lz3/n;->a:Lz3/o;

    invoke-direct {p0}, Lz3/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final x2(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lz3/n;->a:Lz3/o;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
