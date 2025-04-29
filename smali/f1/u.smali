.class public final synthetic Lf1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lf1/v$b;

.field public final synthetic k:Lf1/r;


# direct methods
.method public synthetic constructor <init>(Lf1/v$b;Lf1/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/u;->j:Lf1/v$b;

    iput-object p2, p0, Lf1/u;->k:Lf1/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf1/u;->j:Lf1/v$b;

    iget-object v1, p0, Lf1/u;->k:Lf1/r;

    invoke-static {v0, v1}, Lf1/v;->c(Lf1/v$b;Lf1/r;)V

    return-void
.end method
