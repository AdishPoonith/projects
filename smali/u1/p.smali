.class public final synthetic Lu1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lu1/t$a;

.field public final synthetic k:Ls1/n1;

.field public final synthetic l:Lv1/i;


# direct methods
.method public synthetic constructor <init>(Lu1/t$a;Ls1/n1;Lv1/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/p;->j:Lu1/t$a;

    iput-object p2, p0, Lu1/p;->k:Ls1/n1;

    iput-object p3, p0, Lu1/p;->l:Lv1/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lu1/p;->j:Lu1/t$a;

    iget-object v1, p0, Lu1/p;->k:Ls1/n1;

    iget-object v2, p0, Lu1/p;->l:Lv1/i;

    invoke-static {v0, v1, v2}, Lu1/t$a;->e(Lu1/t$a;Ls1/n1;Lv1/i;)V

    return-void
.end method
