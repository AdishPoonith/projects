.class public final synthetic Lq3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lq3/x$a;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(Lq3/x$a;Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/q;->j:Lq3/x$a;

    iput-object p2, p0, Lq3/q;->k:Ljava/lang/Object;

    iput-wide p3, p0, Lq3/q;->l:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lq3/q;->j:Lq3/x$a;

    iget-object v1, p0, Lq3/q;->k:Ljava/lang/Object;

    iget-wide v2, p0, Lq3/q;->l:J

    invoke-static {v0, v1, v2, v3}, Lq3/x$a;->e(Lq3/x$a;Ljava/lang/Object;J)V

    return-void
.end method
