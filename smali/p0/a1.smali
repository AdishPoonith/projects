.class public final synthetic Lp0/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lp0/j0$b;

.field public final synthetic k:J

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(Lp0/j0$b;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/a1;->j:Lp0/j0$b;

    iput-wide p2, p0, Lp0/a1;->k:J

    iput-wide p4, p0, Lp0/a1;->l:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lp0/a1;->j:Lp0/j0$b;

    iget-wide v1, p0, Lp0/a1;->k:J

    iget-wide v3, p0, Lp0/a1;->l:J

    invoke-static {v0, v1, v2, v3, v4}, Lp0/b1;->a(Lp0/j0$b;JJ)V

    return-void
.end method
