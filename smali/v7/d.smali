.class public final synthetic Lv7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lv7/e$a;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lv7/e$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/d;->j:Lv7/e$a;

    iput-object p2, p0, Lv7/d;->k:Ljava/lang/String;

    iput-object p3, p0, Lv7/d;->l:Ljava/lang/String;

    iput-object p4, p0, Lv7/d;->m:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lv7/d;->j:Lv7/e$a;

    iget-object v1, p0, Lv7/d;->k:Ljava/lang/String;

    iget-object v2, p0, Lv7/d;->l:Ljava/lang/String;

    iget-object v3, p0, Lv7/d;->m:Ljava/lang/Object;

    invoke-static {v0, v1, v2, v3}, Lv7/e$a;->d(Lv7/e$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
