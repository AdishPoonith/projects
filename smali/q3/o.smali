.class public final synthetic Lq3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lq3/x$a;

.field public final synthetic k:J

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Lq3/x$a;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/o;->j:Lq3/x$a;

    iput-wide p2, p0, Lq3/o;->k:J

    iput p4, p0, Lq3/o;->l:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lq3/o;->j:Lq3/x$a;

    iget-wide v1, p0, Lq3/o;->k:J

    iget v3, p0, Lq3/o;->l:I

    invoke-static {v0, v1, v2, v3}, Lq3/x$a;->j(Lq3/x$a;JI)V

    return-void
.end method
