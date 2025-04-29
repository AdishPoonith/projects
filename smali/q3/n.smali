.class public final synthetic Lq3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lq3/x$a;

.field public final synthetic k:I

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(Lq3/x$a;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/n;->j:Lq3/x$a;

    iput p2, p0, Lq3/n;->k:I

    iput-wide p3, p0, Lq3/n;->l:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lq3/n;->j:Lq3/x$a;

    iget v1, p0, Lq3/n;->k:I

    iget-wide v2, p0, Lq3/n;->l:J

    invoke-static {v0, v1, v2, v3}, Lq3/x$a;->f(Lq3/x$a;IJ)V

    return-void
.end method
