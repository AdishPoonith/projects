.class public final synthetic Lw1/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lw1/w$a;

.field public final synthetic k:Lw1/w;

.field public final synthetic l:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lw1/w$a;Lw1/w;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/v;->j:Lw1/w$a;

    iput-object p2, p0, Lw1/v;->k:Lw1/w;

    iput-object p3, p0, Lw1/v;->l:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lw1/v;->j:Lw1/w$a;

    iget-object v1, p0, Lw1/v;->k:Lw1/w;

    iget-object v2, p0, Lw1/v;->l:Ljava/lang/Exception;

    invoke-static {v0, v1, v2}, Lw1/w$a;->e(Lw1/w$a;Lw1/w;Ljava/lang/Exception;)V

    return-void
.end method
