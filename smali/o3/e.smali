.class public final synthetic Lo3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lo3/f$a$a$a;

.field public final synthetic k:I

.field public final synthetic l:J

.field public final synthetic m:J


# direct methods
.method public synthetic constructor <init>(Lo3/f$a$a$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo3/e;->j:Lo3/f$a$a$a;

    iput p2, p0, Lo3/e;->k:I

    iput-wide p3, p0, Lo3/e;->l:J

    iput-wide p5, p0, Lo3/e;->m:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lo3/e;->j:Lo3/f$a$a$a;

    iget v1, p0, Lo3/e;->k:I

    iget-wide v2, p0, Lo3/e;->l:J

    iget-wide v4, p0, Lo3/e;->m:J

    invoke-static/range {v0 .. v5}, Lo3/f$a$a;->a(Lo3/f$a$a$a;IJJ)V

    return-void
.end method
