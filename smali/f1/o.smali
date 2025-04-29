.class public final synthetic Lf1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lf1/q$a;


# direct methods
.method public synthetic constructor <init>(Lf1/q$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/o;->j:Lf1/q$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf1/o;->j:Lf1/q$a;

    invoke-static {v0}, Lf1/q;->a(Lf1/q$a;)V

    return-void
.end method
