.class public final synthetic Lu1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lu1/t$a;

.field public final synthetic k:I

.field public final synthetic l:J

.field public final synthetic m:J


# direct methods
.method public synthetic constructor <init>(Lu1/t$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/j;->j:Lu1/t$a;

    iput p2, p0, Lu1/j;->k:I

    iput-wide p3, p0, Lu1/j;->l:J

    iput-wide p5, p0, Lu1/j;->m:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lu1/j;->j:Lu1/t$a;

    iget v1, p0, Lu1/j;->k:I

    iget-wide v2, p0, Lu1/j;->l:J

    iget-wide v4, p0, Lu1/j;->m:J

    invoke-static/range {v0 .. v5}, Lu1/t$a;->i(Lu1/t$a;IJJ)V

    return-void
.end method
